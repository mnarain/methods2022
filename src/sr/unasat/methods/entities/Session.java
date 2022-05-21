package sr.unasat.methods.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Session {
    private Integer id;
    private String username;
    private LocalDateTime start;
    private LocalDateTime end;
    private final Integer MAX_DURATION_IN_HOURS = 24;
    private final Integer TIME_OUT_IN_MINUTES = 30;

    public Session() {
    }

    public Session(Integer id, String username, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.username = username;
        this.start = start;
        this.end = end;
    }

    public Session(Integer id, String username, LocalDateTime start) {
        this.id = id;
        this.username = username;
        this.start = start;
        System.out.println("Het object isaangemaakt");
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
