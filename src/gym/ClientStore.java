package gym;

public abstract class ClientStore {

    public Membership orderMembership(String type) {
        Membership membership;
        membership = createMembership(type);
        membership.declaration();
        membership.register();
        return membership;
    }

    protected abstract Membership createMembership(String type);
}
