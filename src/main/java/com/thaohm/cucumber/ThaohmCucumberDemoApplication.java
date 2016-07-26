package com.thaohm.cucumber;

import com.thaohm.cucumber.model.Book;
import com.thaohm.cucumber.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ThaohmCucumberDemoApplication {

	@Autowired
	public void createBooks(BookRepository bookRepository) {
		Book hoaVangTrenCoXanh = new Book();
        hoaVangTrenCoXanh.setAuthor("Nguyen Nhat Anh");
        hoaVangTrenCoXanh.setTitle("Toi thay hoa vang tren co xanh");

		Book sucManhCuaSuTapTrung = new Book();
        sucManhCuaSuTapTrung.setAuthor("Jack Cansfield");
        sucManhCuaSuTapTrung.setTitle("Suc manh cua su tap trung");

		Book lyThuyetSieuDay = new Book();
		lyThuyetSieuDay.setAuthor("Stephen Hawking");
		lyThuyetSieuDay.setTitle("Ly thuyet sieu day");

		bookRepository.save(Arrays.asList(hoaVangTrenCoXanh, sucManhCuaSuTapTrung, lyThuyetSieuDay));
	}

	public static void main(String[] args) {
		SpringApplication.run(ThaohmCucumberDemoApplication.class, args);
	}
}
