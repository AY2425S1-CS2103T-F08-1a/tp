package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("-name ");
    public static final Prefix PREFIX_PHONE = new Prefix("-handphone ");
    public static final Prefix PREFIX_HOURS = new Prefix("-hours ");
    public static final Prefix PREFIX_EMAIL = new Prefix("-email ");
    public static final Prefix PREFIX_ADDRESS = new Prefix("-address ");
    public static final Prefix PREFIX_TAG = new Prefix("t/"); // TODO change?
    public static final Prefix PREFIX_FILEPATH = new Prefix("-filepath ");


}
