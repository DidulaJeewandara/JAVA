interface chair {
    void create();
}

interface sofa {
    void create();
}   

class vicorianchair implements chair {
    public void create() {
        System.out.println("Creating Victorian Chair");
    }
}

class victoriansofa implements sofa {
    public void create() {
        System.out.println("Creating Victorian Sofa");
    }
}

class modernchair implements chair {
    public void create() {
        System.out.println("Creating Modern Chair");
    }
}

class modernsofa implements sofa {
    public void create() {
        System.out.println("Creating Modern Sofa");
    }
}

interface furniturefactory {
    chair createchair();
    sofa creatsofa();
}

class victorianfactory implements furniturefactory {
    public chair createchair() {
        return new vicorianchair();
    }
    public sofa creatsofa() {
        return new victoriansofa();
    }
}

class modernfactory implements furniturefactory {
    public chair createchair() {
        return new modernchair();
    }
    public sofa creatsofa() {
        return new modernsofa();
    }
}

class abstract_factory {
    public static void main(String[] args) {
        furniturefactory factory1 = new victorianfactory();
        furniturefactory factory2 = new modernfactory();

        chair c1 = factory1.createchair();
        sofa s1 = factory1.creatsofa();
        chair c2 = factory2.createchair();
        sofa s2 = factory2.creatsofa();
        c1.create();
        s1.create();
        c2.create();
        s2.create();
    }
}