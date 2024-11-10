package by.ekids.rememberjava;

public class Cat extends Animal {
    private final String[] RESTRICTED_NAMES = {"Haisenberg", "Freddy Cruger", "Sauron"};

    public Cat(int age, double aWeight, String name) {
        super(age, aWeight, name);
    }

    public void sayMyName() {
        System.out.println("Say my name!!!!");
        System.out.println(getName());
    }

    @Override
    public void setName(String name) {
    for (String restrictedName : RESTRICTED_NAMES) {
        if (name.equals(restrictedName))
            return;
    }

    super.setName(name);
    }
}
