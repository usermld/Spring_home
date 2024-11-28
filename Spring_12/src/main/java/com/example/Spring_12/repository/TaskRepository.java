import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Получить список задач по их статусу
     * @param status
     * @return
     */
    List<Task> findByStatus(TaskStatus status);
}