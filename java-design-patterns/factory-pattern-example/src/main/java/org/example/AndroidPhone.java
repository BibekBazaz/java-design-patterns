package org.example;

public class AndroidPhone extends Phone
{
    @Override
    public void createPhone() {
        Specifications cameraSpecification = new Specifications();
        cameraSpecification.setSpecification("12 MP camera");
        Specifications chipSetSpecification = new Specifications();
        chipSetSpecification.setSpecification("Snapdragon");
        specificationsList.add(cameraSpecification);
        specificationsList.add(chipSetSpecification);
    }
}
