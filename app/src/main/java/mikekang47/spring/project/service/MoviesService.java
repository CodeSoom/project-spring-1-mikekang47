package mikekang47.spring.project.service;


import lombok.RequiredArgsConstructor;
import mikekang47.spring.project.dto.MoviesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MoviesService {
    @Autowired
    private MovieApiClient movieApiClient;

    /**
     * 전달된 keyword로 검색한 해당하는 영화를 찾습니다.
     * @param keyword 전달된 keyword
     */
    @Transactional(readOnly = true)
    public MoviesData findByKeyword(String keyword) {
        return movieApiClient.requestMovie(keyword);
    }

}
