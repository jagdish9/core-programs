/*
package demo;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    publci String doPayment(@RequestBody PaymentDTO paymentDto) {

    }

    public String updatePayment(@RequestParam String paymentId) {
        payemntService.updatePayment(paymentId);
    }
}

@Service
class PaymentService {

    private final PayementRepository payementRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.payementRepository = paymentRepository;
    }

    public String updatePayment(String paymentId) {
        payementRepository.updateByPaymentId(paymentId);
    }
}

@Respository
interface PaymentRepository extends JpaRepository<> {

}


*/
