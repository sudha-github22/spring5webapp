package com.ssd.springframework.spring5webapp.bootstrap;

import com.ssd.springframework.spring5webapp.domain.Author;
import com.ssd.springframework.spring5webapp.domain.Book;
import com.ssd.springframework.spring5webapp.domain.Publisher;
import com.ssd.springframework.spring5webapp.repositories.AuthorRepository;
import com.ssd.springframework.spring5webapp.repositories.BookRepository;
import com.ssd.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(PublisherRepository publisherRepository,AuthorRepository authorRepository,
                         BookRepository bookRepository ) {

        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher("SFG Publishing","Maple Avenue",
                "Sandyford","Dublin","D18");

        publisherRepository.save(publisher);
        Author john = new Author("John","Thompson");

        Book noEJB = new Book("J2EE Application Without EJB","156772987");


       noEJB.getAuthors().add(john);

        john.getBooks().add(noEJB);

        noEJB.setPublisher(publisher);

        publisher.getBooks().add(noEJB);

        authorRepository.save(john);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        Book spring = new Book("Spring Framework","156547787");
        spring.getAuthors().add(john);
        john.getBooks().add(spring);
        spring.setPublisher(publisher);
        publisher.getBooks().add(spring);


        bookRepository.save(spring);
        publisherRepository.save(publisher);



        //second Publisher
        Author robert = new Author("James","Robert");
        Book ddd = new Book("domain driven Design","1324242987");

        robert.getBooks().add(ddd);
        ddd.getAuthors().add(robert);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(robert);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);


        System.out.println("Running BootStrap Data...");
        System.out.println("Publisher book Count :"+publisher.getBooks().size());
        System.out.println("Author Count :"+authorRepository.count());
        System.out.println("Author Robert Book Count :"+robert.getBooks().size());
        System.out.println("Author John Book Count :"+john.getBooks().size());
    }
}
