package oop_terminal;
public abstract class Transportation {
    protected String name;

    public Transportation(String name) {
        this.name = name;
    }

    // ✅ Getter & Setter di sini (parent)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();
}

