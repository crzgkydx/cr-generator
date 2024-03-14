package org.cr.cli.example;

import picocli.CommandLine;

import picocli.CommandLine.Option;

@CommandLine.Command
public class mustLogin implements Runnable {
    @Option(names = "--interactive", interactive = true)
    String value;

    public void run() {
        if (value == null && System.console() != null) {
            // alternatively, use Console::readPassword
            value = System.console().readLine("Enter value for --interactive: ");
        }
        System.out.println("You provided value '" + value + "'");
    }

    public static void main(String[] args) {
        new CommandLine(new mustLogin()).execute(args);
    }
}