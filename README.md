# Java-Applet---Degree-to-Fahrenheit

The given code is a Java applet for a temperature converter. It allows the user to input a temperature  value in either Fahrenheit or Celsius and converts it to the other unit based on the selected checkbox option. The converted temperature is displayed in the respective text field.

The applet consists of the following components:
1. Three text fields (t1, t2, t3) for input and output of temperature values.
2. Three labels (l1, l2, l3) to display instructions and converted temperature values.
3. Two checkboxes (r1, r2) to select the conversion option (Fahrenheit to Celsius or Celsius to Fahrenheit).
4. One button (b1) labeled "Clear" to clear the input and output fields.

The applet uses the init() method to initialize the components, set their positions using absolute layout (null layout), and add event listeners for button click and checkbox selection. The ‘aa’ class implements the ItemListener interface to handle checkbox events and perform the temperature conversion based on the selected option. The ‘a’ class implements the ActionListener interface to handle button click events and clear the input and output fields when the "Clear" button is clicked.The given HTML code is used to embed the Java applet "Convert.class" into a web page. The applet will be displayed with a height of 350 pixels and a width of 600 pixels. The applet code is specified using the "code" attribute, which refers to the compiled Java class file "Convert.class". The title of the web page is set to "Java programming IE-2" in the "head" section of the HTML code.
