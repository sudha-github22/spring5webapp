//package com.ssd.springframework.spring5webapp.bootstrap;
//
//import com.ssd.springframework.spring5webapp.domain.Author;
//import com.ssd.springframework.spring5webapp.domain.Book;
//import com.ssd.springframework.spring5webapp.repositories.AuthorRepository;
//import com.ssd.springframework.spring5webapp.repositories.BookRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BookAuthorBootStrap implements CommandLineRunner {
//    private final AuthorRepository authorRepository;
//    private final BookRepository bookRepository;
//
//    public BookAuthorBootStrap(AuthorRepository authorRepository, BookRepository bookRepository) {
//        this.authorRepository = authorRepository;
//        this.bookRepository = bookRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Author john = new Author("John","Thompson");
//        Book noEJB = new Book("J2EE Application Without EJB","156772987");
//
//        john.getBooks().add(noEJB);
//        noEJB.getAuthors().add(john);
//
//        authorRepository.save(john);
//        bookRepository.save(noEJB);
//
//        //2nd Book author
//        Author robert = new Author("James","Robert");
//        Book ddd = new Book("domain driven Design","1324242987");
//
//        robert.getBooks().add(ddd);
//        ddd.getAuthors().add(robert);
//
//        authorRepository.save(robert);
//        bookRepository.save(ddd);
//
//        System.out.println("Running BootStrap Data...");
//        System.out.println("Book Count :"+bookRepository.count());
//    }
//}
