public class DogShelter {

    int sDogFoodNeeded = 10;
    int mDogFoodNeeded = 20;
    int lDogFoodNeeded = 30;

    public static void main(String[] args) throws Exception {

        DogShelter dogshelter = new DogShelter();
        dogshelter.dogFoodCalc(10, 10, 10, 2.3f);
    }


    public float dogFoodCalc(int sDog, int mDog, int lDog, float rFood) throws Exception {


        float orderAmount = 0;
        try {
            int sDogTotalFoodNeeded = sDogFoodNeeded * sDog;
            int mDogTotalFoodNeeded = mDogFoodNeeded * mDog;
            int lDogTotalFoodNeeded = lDogFoodNeeded * lDog;
            int totalDogs = sDog + mDog + lDog;
            float twentyPercent = 0.20f;

            int subTotalFoodNeeded = sDogTotalFoodNeeded + mDogTotalFoodNeeded + lDogTotalFoodNeeded;
            float totalFoodNeededPercent = subTotalFoodNeeded * twentyPercent;
            float totalFoodNeeded = totalFoodNeededPercent + subTotalFoodNeeded;
            orderAmount = totalFoodNeeded - rFood;

            if (totalDogs > 30) {
                throw new Exception("Dogs exceed expected amount of 30 or less");

            } else {
                System.out.println(orderAmount + "lbs of food needed for next order.");
            }


        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }


        return orderAmount;
    }
}
