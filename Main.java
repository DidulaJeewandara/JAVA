import java.util.Stack;

abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup
    public Command(Application app,Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    void saveBackup() {
        backup = editor.getContent();


    }

    void undo() {
        editor.setContent(backup);
    }

    public abstract void execute();

    

}

class copyCommand extends Command {
    public copyCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public void execute(){
        saveBackup();
        // Implement copy logic here
    }

    
}
class pasteCommand extends Command {
    public pasteCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public void execute(){
        saveBackup();
        editor.setContent(backup);
        // Implement paste logic here
    }

    
}

class undoCommand extends Command {
    public undoCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public void execute(){
        undo();
    }

    
}

class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command command) {
        history.push(command);
    }   
}

class Editor {
    String text="hi";


    public String getContent() {
        return text;


    }

    public void setContent(String content) {
        this.text = content;
    }

    
}

class Application {
    private Editor editor;
    private CommandHistory history;
    
    public Application() {
        editor = new Editor();
        history = new CommandHistory();
    }

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }


public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        Command copy = new copyCommand(app, app.Editor);
        Command paste = new pasteCommand(app, app.Editor);
        Command undo = new undoCommand(app, app.Editor);

        app.executeCommand(copy);
        app.executeCommand(paste);
        app.executeCommand(undo);
    }
}i