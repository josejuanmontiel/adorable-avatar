package io.adorable.repository

import io.adorable.repository.model.FaceParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate;

@Repository
class AdorableRepository {

    @Autowired
    private RestTemplate restTemplate;

    public FaceParam getTypes() {
        ParameterizedTypeReference<FaceParam> typeRef = new ParameterizedTypeReference<FaceParam>() {};

        // TODO Parametrizar url

        ResponseEntity<FaceParam> response = restTemplate.exchange("http://api.adorable.io/avatars/list", HttpMethod.GET, null, typeRef);

        return response.getBody();
    }

}
