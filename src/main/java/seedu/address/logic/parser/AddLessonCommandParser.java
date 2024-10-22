package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.AddLessonCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new AddLessonCommand object
 */
public class AddLessonCommandParser implements Parser<AddLessonCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the AddLessonCommand
     * and returns an AddLessonCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public AddLessonCommand parse(String args) throws ParseException {
        try {
            String[] parts = args.split(" ");
            Index TutorIndex = ParserUtil.parseIndex(parts[1]);
            Index TuteeIndex = ParserUtil.parseIndex(parts[2]);
            return new AddLessonCommand(TutorIndex, TuteeIndex);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddLessonCommand.MESSAGE_USAGE), pe);
        }
    }
}
