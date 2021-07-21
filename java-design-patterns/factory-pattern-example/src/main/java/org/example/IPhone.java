package org.example;

public class IPhone extends Phone{


    @Override
    public void createPhone() {
        Specifications cameraSpecification = new Specifications();
        cameraSpecification.setSpecification("16 MP camera");
        Specifications chipSetSpecification = new Specifications();
        chipSetSpecification.setSpecification("Intel");
        specificationsList.add(cameraSpecification);
        specificationsList.add(chipSetSpecification);
    }
}
