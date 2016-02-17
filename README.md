# objectDeclaration
create declaration of java instance, which can help with initialization JUnit test from catched instances ...


the aim of this porject is simply class which consum any Java object instance and this instance is analyzed and then print to standart output the declaration of this instance.

e.g. you have initialized POJO with string with name "text" and integer with name "number" properties with values for string is "long text" and value for integer is 5. then the output will be

`YourObject a = new YourObject();`
`a.setText("long text");`
`a.setNumber(5);`


