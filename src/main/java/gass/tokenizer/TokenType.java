package gass.tokenizer;

/** Token types */
public enum TokenType {
    // Tokenizer types
        // basic
            NONE,    // none
            WORD,    // word
            NUMBER,  // number
            FLOAT,   // float number
            ENDLINE, // endline
            COMMA,   // ,
            DOT,     // .
        // quotes
            BACK_QUOTE,   // `
            DOUBLE_QUOTE, // "
            SINGLE_QUOTE, // '
        // single math
            PLUS,     // +
            MINUS,    // -
            MULTIPLY, // *
            DIVIDE,   // /
            EQUAL,    // =
            MODULO,   // %
        // double math
            INCREMENT,       // ++
            PLUS_EQUALS,     // +=
            DECREMENT,       // --
            MINUS_EQUALS,    // -=
            MULTIPLY_EQUALS, // *=
            DIVIDE_EQUALS,   // /=
        // single logical
            GREATER_THAN, // >
            LESS_THAN,    // <
            QUESTION,     // ?
            NOT,          // !
        // double logical
            GREATER_THAN_OR_EQUAL, // >=
            LESS_THAN_OR_EQUAL,    // <=
            NOT_EQUAL,             // !=
            DOUBLE_EQUAL,          // ==
            AND,                   // &&
            OR,                    // ||
    // Parser types
        // parameter
            CIRCLE_BLOCK_BEGIN, // (
            CIRCLE_BLOCK_END,   // )
        // array
            SQUARE_BLOCK_BEGIN, // [
            SQUARE_BLOCK_END,   // ]
        // class
            FIGURE_BLOCK_BEGIN, // {
            FIGURE_BLOCK_END,   // }
            PRIVATE,     // private
            PUBLIC,      // public
        // enum
            ENUM,
        // block
            BLOCK_BEGIN, // :
            END,         // end
        // function & procedure
            BLOCK_CALL,
            RETURN_VALUE, // return
        // variable
            VARIABLE_NAME,
            PARAMETER_NAME,
        // other block
            IF,
            ELSE,
            FOR,
            WHILE,
            CASE,
            DEFAULT,
            CONTINUE,
}