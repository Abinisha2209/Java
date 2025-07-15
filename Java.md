How java works and compiles code ?

1.Compilation

```
javac Codechef.java
```

This command compiles `Codechef.java` and converts it into bytecode, generating a new file called `Codechef.class`.

2 . Execution

```
java Codechef
```

- This command executes the compiled bytecode with the help of the JVM. The JVM converts the bytecode into a machine-readable form, allowing the program to run on any system.
    
- Try running this command in the console and check if you see the output.


Java Virtual Machine

- Why does Java create a .class file? The reason is that this .class file is not OS-specific, meaning we can run it on any operating system. The only requirement is that the system must have a JVM installed.
    
- Essentially, the JVM acts as a program or a container that takes in the .class (bytecode) file and generates the output.