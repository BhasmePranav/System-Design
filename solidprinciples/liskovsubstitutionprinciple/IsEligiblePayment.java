package LowLevelDesign.solidprinciples.liskovsubstitutionprinciple;

public interface IsEligiblePayment extends Payment
{
    public boolean isEligible(double amount);
}
