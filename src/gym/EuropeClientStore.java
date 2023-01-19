package gym;

public class EuropeClientStore extends ClientStore{
    @Override
    protected Membership createMembership(String item) {
        if (item.equals("Student")) {
            return new StudentMembership();
        } else if (item.equals("Normal")) {
            return new NormalMembership();
        }
        else return null;
    }
}
