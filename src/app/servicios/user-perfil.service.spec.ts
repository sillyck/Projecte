import { TestBed } from '@angular/core/testing';

import { UserPerfilService } from './user-perfil.service';

describe('UserPerfilService', () => {
  let service: UserPerfilService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserPerfilService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
