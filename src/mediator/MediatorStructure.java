package mediator;

// 具体中介者
public class MediatorStructure extends Mediator {

    private Tenant tenant;
    private HouseOwner houseOwner;

    public Tenant getTenant() {
        return tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == tenant) {
            houseOwner.getMessage(message);
        } else {
            tenant.getMessage(message);
        }
    }
}
