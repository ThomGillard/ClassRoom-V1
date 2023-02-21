package be.thomas.ClassRoomV1.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class DataInit implements InitializingBean {
    private final Repository repository;
    public DataInit(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        log.info("-- INITIALIZING DB DATA --");

        ClassRoom classRoom = new ClassRoom();
        classRoom.setDbItem(new Object());
        classRoom = repository.save(classRoom);


        log.info("-- DATA INIT FINISHED --");
    }
}
