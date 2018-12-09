<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.SplitPane?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.RowConstraints?>

<BorderPane stylesheets="@GameTheme2.css" xmlns="http://javafx.com/javafx/10.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="app.controller.SudokuController">
   <bottom>
      <HBox alignment="CENTER" prefHeight="82.0" prefWidth="306.0" BorderPane.alignment="CENTER">
         <children>
            <Button mnemonicParsing="false" onAction="#btnStartGame" text="Start Game" />
            <Button mnemonicParsing="false" onAction="#btnEndGame" text="End Game" />
            <Button mnemonicParsing="false" onAction="#btnCheckGame" text="Check" />
         </children></HBox>
   </bottom>
   <top>
      <HBox alignment="CENTER" prefHeight="27.0" prefWidth="200.0" BorderPane.alignment="CENTER">
         <children>
            <GridPane fx:id="gpTop" alignment="CENTER" prefHeight="21.0" prefWidth="200.0">
              <columnConstraints>
                <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
                <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
              </columnConstraints>
              <rowConstraints>
                <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
              </rowConstraints>
            </GridPane>
         </children></HBox>
   </top>
   <center>
      <SplitPane dividerPositions="0.6106870229007634" orientation="VERTICAL" prefHeight="200.0" prefWidth="160.0" BorderPane.alignment="CENTER">
         <items>
            <HBox fx:id="hboxGrid" alignment="CENTER" prefHeight="100.0" prefWidth="200.0" />
            <HBox fx:id="hboxNumbers" alignment="CENTER" prefHeight="48.0" prefWidth="471.0">
               <opaqueInsets>
                  <Insets bottom="3.0" left="3.0" right="3.0" top="3.0" />
               </opaqueInsets></HBox>
         </items>
      </SplitPane>
   </center>
</BorderPane>