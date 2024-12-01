package DaoInterface;

import java.util.List;

import Entity.Author;

public interface AuthorDAO {
    void addAuthor(Author author);
    Author getAuthorById(int id);
    void updateAuthor(Author author);
    void deleteAuthor(int id);
}

