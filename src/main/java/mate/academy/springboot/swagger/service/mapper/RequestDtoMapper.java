package mate.academy.springboot.swagger.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D d);
}
