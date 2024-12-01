package DaoInterface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Author;

public class AuthorDaoImp implements AuthorDAO {
    private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void addAuthor(Author author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
    }

    @Override
    public Author getAuthorById(int id) {
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, id);
        session.close();
        return author;
    }

    @Override
    public void updateAuthor(Author author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteAuthor(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Author author = session.get(Author.class, id);
        if (author != null) {
            session.delete(author);
        }
        transaction.commit();
        session.close();
    }
}

