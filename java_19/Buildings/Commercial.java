package Buildings;

abstract class Commercial implements Building, Comparable {

    // Variables for any commercial building
    private String address, name;
    private int value, stories;
    private boolean forSale;


    /**
     * Default constructor for Commercial buildings
     * @param address: the address of the building
     * @param name: name of the building
     * @param value: the value of the building
     * @param stories: Number of stories of the building
     * @param forSale: is the building for sale or not
     */
    public Commercial(String address, String name, int value, int stories, boolean forSale){
        this.address = address;
        this.name = name;
        this.value = value;
        this.stories = stories;
        this.forSale = forSale;
    }


    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getValue() {
        return value;
    }


    @Override
    public int getStories() {
        return stories;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isForSale() {
        return forSale;
    }

    /**
     * What Services are available at the building
     */
    abstract public void services();


    @Override
    public int compareTo(Object o) {
        int compareValue = 0;

        if (o instanceof Commercial){
            if (this.getValue() > ((Commercial) o).getValue()){
                compareValue = 1;
            }
            else if (this.getValue() < ((Commercial) o).getValue()){
                compareValue = -1;
            }
        }


        return compareValue;
    }


    @Override
    public String toString() {
        return "Commercial{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", forSale=" + forSale +
                '}';
    }
}
