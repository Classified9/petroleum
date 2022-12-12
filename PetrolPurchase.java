package petroleum;

public class PetrolPurchase {
        private String stationLocation;
        private String petrolType;
        private int quantity;
        private double pricePerLiters;
        private double percentageDiscount;


        public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLiters ){
            this.stationLocation =stationLocation;
            this.petrolType = petrolType;
            this.quantity = quantity;
            this.pricePerLiters = pricePerLiters;

        }

        public void setStationLocation(String stationLocation){
            this.stationLocation = stationLocation ;
        }

        public String getStationLocation(){
            return stationLocation;
        }

        public void setPetrolType(String petrolType){
            this.petrolType = petrolType;
        }

        public String getPetrolType(){
            return petrolType;
        }

        public void setQuantity(int quantity){
            this.quantity = quantity;
        }

        public int getQuantity(){
            return quantity;
        }

        public void setPricePerLiters(double pricePerLiters){
            this.pricePerLiters = pricePerLiters;
        }

        public double getPricePerLiters(){
            return pricePerLiters;
        }

        public double getPercentageDiscount(){
            return percentageDiscount;
        }

        public void setPercentageDiscount(double percentageDiscount){
            this.percentageDiscount = percentageDiscount * 100;

        }

        public double getPurchaseAmount(){
            double amount = (quantity * pricePerLiters) - percentageDiscount;
            return amount;
        }





}
