package lesson8_9;



class Philosopher {
    public int value;
    public String name;

    public Philosopher(int value, String name) {
	this.value = value;
	this.name = name;
    }

    public String toString() {
	return "value = " + this.value + ", name = " + this.name;
    }
}

