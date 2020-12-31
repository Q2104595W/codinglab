String s1 = "This is a String!";
var s3 = new String("This is also a String!");
var chars = s1.toCharArray();
var s4 = "Shirt size";
var s5 = "M";
String s6 = s4 + s5 + ", Qty: " + 4;
s6 += ", very elegant"
var upper = s6.toUpperCase();
var charAt = s6.charAt(4);
var bytes = s6.getBytes();
var sb = new StringBuilder("Welcome");
sb.append(" to California!");
var s = sb.toString();
StringBuilder b = new StringBuilder();
b.append("Shirt size: ").append("M").append(", Qty: ").append(4);
var s2 = b.toString();