package com.example.mygui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc= new Calculator();

    @FXML
    private TextField inputField;



    @FXML
    protected void onEqualB(){
        calc.setOp2(Double.parseDouble(inputField.getText()));

        try {
            calc.calculate();
            double result = calc.getResult();
            inputField.setText(Double.toString(result));
        } catch (DivisionByZeroEx e) {
            inputField.setText("Error: " + e.getMessage());
        }
    }


    @FXML
    protected void onOneB() {
        String val = inputField.getText();
        if (val.equals("0")) {
            val = "";
        }
            inputField.setText(val + "1");

    }
    @FXML
    protected void onTwoB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"2");

    }

    @FXML
    protected void onThreeB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"3");

    }
    @FXML
    protected void onFourB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"4");

    }
    @FXML
    protected void onFiveB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"5");

    }

    @FXML
    protected void onSixB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"6");
    }

    @FXML
    protected void onSevenB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"7");
    }

    @FXML
    protected void onEightB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"8");
    }

    @FXML
    protected void onNineB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"9");
    }
    @FXML
    protected void onZeroB(){
        String val=inputField.getText();
        if(val.equals("0")){
            val="";
        }
        inputField.setText(val+"0");
    }
    @FXML
    protected void onClearB(){
        String val=inputField.getText();
        inputField.setText("");
    }

    @FXML
    protected void onPlusB(){
        String inputText = inputField.getText();

        if (!inputText.isEmpty()) {
            try {
                calc.setOp1(Double.parseDouble(inputText));
                calc.setOperator('+');
                inputField.clear();
            } catch (NumberFormatException e) {
                inputField.setText("Error: Invalid input");
            }
        }
    }
    @FXML
    private void onMinusB() {
        String inputText = inputField.getText();

        if (!inputText.isEmpty()) {
            try {
                calc.setOp1(Double.parseDouble(inputText));
                calc.setOperator('-');
                inputField.clear();
            } catch (NumberFormatException e) {
                inputField.setText("Error: Invalid input");
            }
        }
    }
    @FXML
    private void onMultiplyB() {
        String inputText = inputField.getText();

        if (!inputText.isEmpty()) {
            try {
                calc.setOp1(Double.parseDouble(inputText));
                calc.setOperator('*');
                inputField.clear();
            } catch (NumberFormatException e) {
                inputField.setText("Error: Invalid input");
            }
        }
    }
    @FXML
    private void onDivideB() {
        String inputText = inputField.getText();
        if (!inputText.isEmpty()) {
            try {
                calc.setOp1(Double.parseDouble(inputText));
                calc.setOperator('/');
                inputField.clear();
            } catch (NumberFormatException e) {
                inputField.setText("Error: Invalid input");
            }
        }

    }











}