# objectDeclaration
create declaration of java instance, which can help with initialization JUnit test from caught instances ...


the aim of this project is simply class which consume any Java object instance and this instance is analyzed and then print to standard output the declaration of this instance.

e.g. you have initialized POJO with string with name "text" and integer with name "number" properties with values for string is "long text" and value for integer is 5. then the output will be

<p>`YourObject a = new YourObject();`<br />
`a.setText("long text");`<br />
`a.setNumber(5);`<p>


