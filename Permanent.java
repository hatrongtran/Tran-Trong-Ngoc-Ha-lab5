public class Permanent implements ContractBuilder{
   
        private String tenantID;
        private String propertyID;
        private String contractID;
        private double rentAmount;
        @Override
        public void BuildContractID(String contractID) {
            this.contractID =contractID;
            
        }
        @Override
        public void BuildPropertyID(String propertyID) {
            this.propertyID=propertyID;
            
        }
        @Override
        public void BuildRentAmount(double rentAmount) {
            this.rentAmount=rentAmount;
            
        }
        @Override
        public void BuildTenantID(String tenantID) {
           this.tenantID=tenantID;
            
        }
        @Override
        public Contract signContract() {
           
            return null;
        }
        

}
