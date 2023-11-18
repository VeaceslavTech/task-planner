package at.webdreamsolution.taskplanner.model;

public enum Status {
    NEW(1L),
    IN_PROGRESS(2L),
    ON_HOLD(3L),
    COMPLETED(4L),
    CANCELLED(5L),
    REVIEW(6L);

    private final Long value;

    Status(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }
}