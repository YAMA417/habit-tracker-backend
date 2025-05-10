package io.github.yama417.habit_tracker_backend.repository;

import io.github.yama417.habit_tracker_backend.entity.HabitCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitCheckRepository extends JpaRepository<HabitCheck, Long> {
    List<HabitCheck> findByHabitId(Long habitId);
    List<HabitCheck> findByHabitIdAndDate(Long habitId, java.time.LocalDate date);
}
