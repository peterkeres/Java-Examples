# Lab 8.3 Reading files

Write a program that reads all line of an input file and sends them to output file, preceded by line number. the input file "input.txt" is attached with the lab. the input is:

> Marry had a little lamb.\
> whose fleece was white as snow.\
> and everywhere that mary went.\
> the lamb was sure to go.

the output will be:

> /1/ Marry had a little lamb\
> /2/ whose fleece was white as snow.\
> /3/ and everywhere that mary went,\
> /4/ the lamb was sure to go.

Use the following instructions:
* save the input file in the same folder where your program is
* use the following packages:
    * java.io.FileReader
    * java.io.filenotfoundexception
    * java.util.scanner
* you need to use the method hasNextLine from scanner class. Go to API, read about this method and decied how and where you can use this method in your program. 