public class Client {
    private ContractBuilder builder;

    public Client(ContractBuilder builder) {
        this.builder = builder;
    }

    public Contract requestCreateRentalContract() {
        builder.BuildContractID("01");
        builder.BuildContractID("01");
        builder.BuildTenantID("01");
        builder.BuildRentAmount(01);
        return builder.signContract();
    };
    class Test{
        public static void main(String[] args) {
            ContractBuilder contractBuilder = new LongTerm();
            Client client = new Client(contractBuilder);
            Contract contract = client.requestCreateRentalContract();
            System.out.println(contract);
        }
}
