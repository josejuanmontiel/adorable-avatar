package io.adorable.service

import io.adorable.repository.AdorableRepository
import io.adorable.repository.model.FaceParam
import io.adorable.service.model.FaceParamView
import org.dozer.DozerBeanMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdorableService {

    AdorableRepository adorableRepository

    DozerBeanMapper mapper

    @Autowired
    public AdorableService(AdorableRepository adorableRepository, DozerBeanMapper mapper) {
        this.adorableRepository = adorableRepository
        this.mapper = mapper
    }

    public FaceParamView getTypes() {

        FaceParam facesTypes = adorableRepository.getTypes();

        // TODO http://dozer.sourceforge.net/documentation/apimappings.html

        FaceParamView facesTypesview = mapper.map(facesTypes, FaceParamView.class);

        return facesTypesview;

    }

}
