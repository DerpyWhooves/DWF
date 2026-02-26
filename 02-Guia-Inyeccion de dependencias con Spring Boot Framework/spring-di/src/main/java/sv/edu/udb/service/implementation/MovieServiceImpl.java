package sv.edu.udb.service.implementation;

/*  #01
    MovieServiceImpl.java con inyeccion de dependencias via constructor y Lombok

 */

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.MovieRepository;
import sv.edu.udb.repository.domain.Movie;
import sv.edu.udb.service.MovieService;

@Getter
@Service
@RequiredArgsConstructor //Inyeccion de dependencias por constructor
public class MovieServiceImpl implements MovieService {
    @NonNull // Agrega una condicion para que este valor no pueda ser nulo
    private final MovieRepository movieRepository;
    @Override
    public Movie findMovieById(final Long id) {
        return movieRepository.findMovieById(id);
    }
}

/*
   #02 MovieServiceImpl.java con inyeccion de dependencias via constructor

import lombok.Getter;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.MovieRepository;
import sv.edu.udb.repository.domain.Movie;
import sv.edu.udb.service.MovieService;
import java.util.Objects;
@Getter
@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    public MovieServiceImpl(final MovieRepository movieRepository) {
        this.movieRepository = Objects.requireNonNull(movieRepository);
    }
    @Override
    public Movie findMovieById(final Long id) {
        return movieRepository.findMovieById(id);
    }
}
*/


