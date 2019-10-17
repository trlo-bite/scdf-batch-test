package com.example.batchtest;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class BatchTestTasklet implements Tasklet {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BatchTestJob.class);

    private long id;

    public BatchTestTasklet(long id) {
        this.id = id;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("Executing tasklet with run.id={}", id);
        if (id % 2 != 0) {
            throw new RuntimeException();
        }
        return RepeatStatus.FINISHED;
    }
}
