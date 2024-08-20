package ru.cool.bank.contract.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.cool.bank.api.ExampleApi;
import ru.cool.bank.model.ExampleDto;

/**
 * Пример контроллера на основе описания OpenAPI
 */
@RestController
@RequiredArgsConstructor
public class ExampleController implements ExampleApi {

    @Override
    public ResponseEntity<ExampleDto> example(Long id) {
        var example = new ExampleDto()
                .id(id);

        return ResponseEntity.ok(example);
    }
}
