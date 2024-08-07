package amadorcf.es.YourBank_account_service.external;

import amadorcf.es.YourBank_account_service.config.FeignConfiguration;
import amadorcf.es.YourBank_account_service.model.dto.external.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "user-service", configuration = FeignConfiguration.class)
public interface UserService {

    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return a ResponseEntity containing the user DTO if found, or an empty body with a not found status code
     */
    @GetMapping("/api/users/{userId}")
    ResponseEntity<UserDto> readUserById(@PathVariable Long userId);
}