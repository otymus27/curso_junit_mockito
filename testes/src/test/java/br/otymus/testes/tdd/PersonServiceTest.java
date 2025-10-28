package br.otymus.testes.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    Person person;
    IPersonService service;

    @BeforeEach
    void setup(){
        service = new PersonService();
        person = new Person("Fabio","Rocha","otymus@hotmail.com","Rua Rodobelo");
    }

    @Test
    @DisplayName("Quando criado uma pessoa com sucesso deve retornar uma pessoa")
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {

        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        Person actual = service.createPerson(person);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertNotNull(actual, "The createPerson() should not have returned null! ");

    }

    @Test
    @DisplayName("When Create a Person with Success Should Contains FirstName in Returned Person Object")
    void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPersonObject() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        Person actual = service.createPerson(person);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertNotNull(person.getId(), ()-> "Person ID is Missing! ");
        assertEquals(person.getFirstName(), actual.getFirstName(), ()->"The FirstName is Incorrect!");

    }

    @Test
    @DisplayName("When Create a Person with Success Should Contains LastName in Returned Person Object")
    void testCreatePerson_WhenSucess_ShouldContainsLastNameInReturnedPersonObject() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        Person actual = service.createPerson(person);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertNotNull(actual, "The createPerson() should not have returned null! ");
        assertEquals(person.getLastName(), actual.getLastName(), ()->"The LastName is Incorrect!");

    }

    @Test
    @DisplayName("When Create a Person with Success Should Contains Email in Returned Person Object")
    void testCreatePerson_WhenSucess_ShouldContainsLastEmailInReturnedPersonObject() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        Person actual = service.createPerson(person);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertNotNull(actual, "The createPerson() should not have returned null! ");
        assertEquals(person.getEmail(), actual.getEmail(), ()->"The Email is Incorrect!");

    }

    @Test
    @DisplayName("When Create a Person with Success Should Contains Address in Returned Person Object")
    void testCreatePerson_WhenSucess_ShouldContainsLastAddressInReturnedPersonObject() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        Person actual = service.createPerson(person);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertNotNull(actual, "The createPerson() should not have returned null! ");
        assertEquals(person.getAddress(), actual.getAddress(), ()->"The Address is Incorrect!");

    }

    @Test
    @DisplayName("When Create a Person with null e-Mail Should throw Exception")
    void testCreatePerson_WhithNullEmail_ShouldThrowIllegalArgumentException() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        person.setEmail(null);
        var expected = "E-mail is null or empty!";

        // When and Then / Act and Assertion : Verificação se o retorno foi de acordo com o esperado
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.createPerson(person),
                () -> "Empty e-Mail should have cause an IllegalArgumentException!"

        );

        assertEquals(expected, exception.getMessage(), () ->"Exception error message is incorrect!");

    }


}
