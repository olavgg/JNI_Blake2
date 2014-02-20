JNI_Blake2
==========

Java library that calls Blake2 through a JNI interface.

to compile to C file
gcc -I$JAVA_HOME/include -I$JAVA_HOME/include/linux -o libhello.so -shared HelloJNI.c -fPIC
