public class Bicycle extends Cards{

    private String name;
    private String firstName;
    private String lastName;
    private int id;
    private int cost;
    private int slip;
    private int strength;

    public Bicycle () {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cards guest = (Cards) obj;
        return id == guest.id
                && (firstName == guest.firstName
                || (firstName != null &&firstName.equals(guest.getFirstName())))        && (lastName == guest.lastName
                || (lastName != null && lastName .equals(guest.getLastName())
        ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id; result = prime * result +
                ((lastName == null) ? 0 : lastName.hashCode()); return result;
    }

    @Override
    public String toString() {
        return "Cards [ Name cards = " + name
                + "Cost cards" + cost + "]";
    }

    public void costCalculation (int slip, int strength){
        cost = slip * strength;
    }
}
