/**
 * Constructs a new `Repairer` object based on the provided `RepairerBuilder`.
 * 
 * @param builder The `RepairerBuilder` object containing the information needed to create a `Repairer`.
 */
public Repairer(RepairerBuilder builder) {
    this.firstName = builder.firstName;
    this.secondName = builder.secondName;
    this.age = builder.age;
    this.gender = builder.gender;
    this.address = builder.address;
    this.numTel = builder.numTel;
    this.ownedBike = builder.ownedBike;
}

/**
 * The `RepairerBuilder` static inner class provides a way to build a `Repairer` object
 * using a step-by-step approach. This builder pattern ensures that a `Repairer` object 
 * is constructed with the necessary attributes in a readable and organized manner.
 */
public static class RepairerBuilder {

    private String firstName;
    private String secondName;
    private int age;
    private String gender;
    private String address;
    private String numTel;
    private Bike ownedBike;

    /**
     * Sets the first name of the repairer.
     * 
     * @param name The first name of the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setFirstName(String name) {
        this.firstName = name;
        return this;
    }

    /**
     * Sets the second name (last name) of the repairer.
     * 
     * @param name The second name of the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setSecondName(String name) {
        this.secondName = name;
        return this;
    }

    /**
     * Sets the age of the repairer.
     * 
     * @param age The age of the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * Sets the gender of the repairer.
     * 
     * @param gender The gender of the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Sets the address of the repairer.
     * 
     * @param adress The address of the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setAddress(String adress) {
        this.address = address;
        return this;
    }

    /**
     * Sets the phone number of the repairer.
     * 
     * @param num The phone number of the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setNumTel(String num) {
        this.numTel = num;
        return this;
    }

    /**
     * Sets the bike owned by the repairer.
     * 
     * @param bike The `Bike` object owned by the repairer.
     * @return The current `RepairerBuilder` instance.
     */
    public RepairerBuilder setOwnedBike(Bike bike) {
        this.ownedBike = bike;
        return this;
    }

    /**
     * Builds and returns a `Repairer` object based on the provided information.
     * 
     * @return A new `Repairer` object.
     */
    public Repairer build() {
        return new Repairer(this);
    }
}