package pl.edu.wsiz.io11.demo.package1;

class Dog extends Animal {

    Dog(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Dog{" + "weight=" + getWeight() + '}';
    }

    @Override
    public void grow() {
        if (getWeight() < 10) {
            grow(1);

        } else {
            grow(2);
        }
    }
}
