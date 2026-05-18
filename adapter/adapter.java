package adapter;

interface newmarksheet{
    void marksheet();
}

class fingerprint{
    void fingerprint(){
        System.out.println("Fingerprint is being scanned");
    }
}

class marksheetadapter implements newmarksheet{
    private fingerprint fp;

    public marksheetadapter(fingerprint fp) {
        this.fp = fp;
    }

    @Override
    public void marksheet() {
        fp.fingerprint();
        System.out.println("Marksheets are being generated");
    }
}


public class adapter {
    public static void main(String[] args) {
        fingerprint fp = new fingerprint();
        newmarksheet ms = new marksheetadapter(fp);

    ms.marksheet();
    }   
}