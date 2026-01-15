package com.brunosantos.dscatalog.services;

import com.brunosantos.dscatalog.repositories.ProductRepository;
import com.brunosantos.dscatalog.services.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServicesTest {

    @InjectMocks
    private ProductService service;

    @Mock
    private ProductRepository repository;

    private Long idExisting;
    private Long idNotExisting;

    @BeforeEach
    void setUp() throws Exception{
        idExisting = 1L;
        idNotExisting = 1000L;

        Mockito.lenient().when(repository.existsById(idExisting)).thenReturn(true);
        Mockito.lenient().doNothing().when(repository).deleteById(idExisting);
        Mockito.lenient().when(repository.existsById(idNotExisting)).thenReturn(false);
    }

    @Test
    public void deleteShouldDoNothingWhenIdExists() {

        Assertions.assertDoesNotThrow(() -> {
            service.delete(idExisting);
        });

        Mockito.verify(repository, Mockito.times(1)).existsById(idExisting);
        Mockito.verify(repository, Mockito.times(1)).deleteById(idExisting);
    }

    @Test
    public void throwShouldExceptionWhenIdNotExists() {

        Assertions.assertThrows(ResourceNotFoundException.class, () -> service.delete(idNotExisting));

        Mockito.verify(repository, Mockito.times(1)).existsById(idNotExisting);
        Mockito.verify(repository, Mockito.never()).deleteById(idNotExisting);
    }
}
